package com.ge.demo.service;



import java.util.List;

public interface BaseService <D, DC, DE, ID>{
    public D create (DC dni);
    public D edit(DE dni);
    public List<D> findAll();
    public D findById(ID id);
    public void delete(ID id);
}
