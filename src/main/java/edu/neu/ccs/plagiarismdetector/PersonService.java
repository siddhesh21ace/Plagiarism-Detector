package edu.neu.ccs.plagiarismdetector;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PersonService {
    public List<PersonDTO> findAllPerPage(final Pageable pageable) throws DataAccessException {
        RestTemplate restClient = new RestTemplate();
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.
                    fromUri(restClient.getServiceURI(PERSON_URL))
                    .queryParam("page", pageable.getPageNumber())
                    .queryParam("size", pageable.getPageSize());
            ResponseEntity<PagedResources<PersonDTO>> response =
                    restClient.exchange(
                            builder.toUriString(),
                            HttpMethod.GET,
                            null,
                            new ParameterizedTypeReference<PagedResources<PersonDTO>>() {
                            });
            return new ArrayList<>(response.getBody().getContent());
        } catch (Exception e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
}
