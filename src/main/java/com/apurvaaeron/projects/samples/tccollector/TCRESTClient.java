package com.apurvaaeron.projects.samples.tccollector;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/**
 * Created by apurv on 12-08-2018.
 */
@Component
public class TCRESTClient {
    @Value("${tcbaseurl}")
    private String url;

    @Value("${authuser}")
    private String authuser;

    GetBuildByIdDto getBuildByBuildID(String buildId){
        SSLUtil.turnOffSslChecking();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GetBuildByIdDto> exchange = restTemplate.exchange(url + "app/rest/builds/id:" + buildId, HttpMethod.GET, new HttpEntity<GetBuildByIdDto>(createHeaders("apurvaaeron@gmail.com", "pwd")), GetBuildByIdDto.class);
        return exchange.getBody();
    }

    GetBuildStatisticsByBuildIdDto  getBuildStatisticsByBuildId(String buildId){
        SSLUtil.turnOffSslChecking();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GetBuildStatisticsByBuildIdDto> exchange = restTemplate.exchange(url + "app/rest/builds/id:" + buildId + "/statistics", HttpMethod.GET, new HttpEntity<GetBuildStatisticsByBuildIdDto>(createHeaders("apurvaaeron@gmail.com", "pwd")), GetBuildStatisticsByBuildIdDto.class);
        return exchange.getBody();
    }

    GetChangesByBuildIdDto getChangesByBuildId(String buildId){
        SSLUtil.turnOffSslChecking();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GetChangesByBuildIdDto> exchange = restTemplate.exchange(url + "app/rest/changes?locator=build:(id:" + buildId + ")", HttpMethod.GET, new HttpEntity<GetChangesByBuildIdDto>(createHeaders("apurvaaeron@gmail.com", "pwd")), GetChangesByBuildIdDto.class);
        return exchange.getBody();
    }

    HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
            set( "Accept", "application/json");
        }};
    }
}
