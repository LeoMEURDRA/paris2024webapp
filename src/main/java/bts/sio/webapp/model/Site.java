package bts.sio.webapp.model;

import lombok.Data;

@Data
public class Site {

    private Integer id;
    private String nom;
    private String rue;
    private Integer code_postal;
    private String ville;

}
