package test;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;

/**
 * Created by apurv on 12-08-2018.
 */
public class TCRESTClient {
    @Value("")
    private String url;
    private String auth;


    private Object getBuildByBuildID(){
        return null;
    }

    private Object getBuildStatisticsByBuildId(){
        return null;
    }

    private Object getChangesByBuildId(){
        return null;
    }
}
