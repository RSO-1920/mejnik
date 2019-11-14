package controllers;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
@Path("/demo/info")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MejnikResource {

    @GET
    public Response getMejnik1() {

        MejnikDTO mejnikDTO = new MejnikDTO();

        List<String> clani = Arrays.asList("uz1734", "TODO", "TODO");
        List<String> mikrostoritve = Arrays.asList("http://35.238.67.18:8083/v1/users",
                "http://34.67.224.136:8080/v1/channels/",
                "http://35.223.19.179:8088/v1/catalog/user/1"
        );
        List<String> github = Arrays.asList("https://github.com/RSO-1920/users",
                "https://github.com/RSO-1920/channels",
                "https://github.com/RSO-1920/catalog");
        List<String> travis = Arrays.asList("https://travis-ci.org/RSO-1920/users",
                "https://travis-ci.org/RSO-1920/channels",
                "https://travis-ci.org/RSO-1920/catalog");
        List<String> dockerhub = Arrays.asList("https://cloud.docker.com/u/rso1920/repository/docker/rso1920/users",
                "https://cloud.docker.com/u/rso1920/repository/docker/rso1920/channels",
                "https://cloud.docker.com/u/rso1920/repository/docker/rso1920/catalog");

        mejnikDTO.setClani(clani);
        mejnikDTO.setOpis_projekta("Nas projekt implementira aplikacijo za deljenje in ogled dototek različnih formatov.");
        mejnikDTO.setMikrostoritve(mikrostoritve);
        mejnikDTO.setGithub(github);
        mejnikDTO.setTravis(travis);
        mejnikDTO.setDockerhub(dockerhub);

        return Response.ok(mejnikDTO).build();
    }

}