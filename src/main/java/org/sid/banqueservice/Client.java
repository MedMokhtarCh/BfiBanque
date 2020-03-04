package org.sid.banqueservice;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity

public class Client implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;
    private String nomClient;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Compte> comptes;

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public Client(Long codeClient, String nomClient, Collection<Compte> comptes) {
        this.codeClient = codeClient;
        this.nomClient = nomClient;
        this.comptes = comptes;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "codeClient=" + codeClient +
                ", nomClient='" + nomClient + '\'' +
                ", comptes=" + comptes +
                '}';
    }
}
