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

        List<String> clani = Arrays.asList("uz1734", "jp8765", "dp5306");
        List<String> mikrostoritve = Arrays.asList("http://35.223.19.179/users/v1/users",
                "http://35.223.19.179/users/v1/users/3",
                "http://35.223.19.179/channels/v1/channels/",
                "http://35.223.19.179/channels/v1/channels/channelUsers/2",
                "http://35.223.19.179/channels/v1/channels/userChannels/2",
                "http://35.223.19.179/channels/v1/channels/1",
                "http://35.223.19.179/catalog/v1/catalog/user/1",
                "http://35.223.19.179/catalog/v1/fileMetadata/1",
                "http://35.223.19.179/catalog/v1/catalog/channel/1",
                "http://35.223.19.179/streamer/v1/stream"

        );
        List<String> github = Arrays.asList("https://github.com/RSO-1920/users",
                "https://github.com/RSO-1920/channels",
                "https://github.com/RSO-1920/catalog",
                "https://github.com/RSO-1920/videoStreamer");
        List<String> travis = Arrays.asList("https://travis-ci.org/RSO-1920/users",
                "https://travis-ci.org/RSO-1920/channels",
                "https://travis-ci.org/RSO-1920/catalog",
                "https://travis-ci.org/RSO-1920/videoStreamer");
        List<String> dockerhub = Arrays.asList("https://cloud.docker.com/u/rso1920/repository/docker/rso1920/users",
                "https://cloud.docker.com/u/rso1920/repository/docker/rso1920/channels",
                "https://cloud.docker.com/u/rso1920/repository/docker/rso1920/catalog",
                "https://hub.docker.com/repository/docker/rso1920/video-streamer");

        mejnikDTO.setClani(clani);
        mejnikDTO.setOpis_projekta("Nas projekt implementira aplikacijo za deljenje in ogled dototek različnih formatov.");
        mejnikDTO.setMikrostoritve(mikrostoritve);
        mejnikDTO.setGithub(github);
        mejnikDTO.setTravis(travis);
        mejnikDTO.setDockerhub(dockerhub);

        return Response.ok(mejnikDTO).build();
    }

}