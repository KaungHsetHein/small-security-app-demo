package com.example.permissiionevaluator.ds;

import javax.print.Doc;

public class Document {
    private String owner;
    public Document(){

    }

    public Document(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
