package com.aft.encuestas.service.core;

import com.aft.encuestas.model.Encuesta;

import java.util.List;
import java.util.Map;

public interface MyManagerBiDefault {

    public Encuesta find(Encuesta encuesta) throws Exception;

    public List<Encuesta> findEncuestas (String idioma) throws Exception;

    public List<Encuesta> findSubTiposEncuestas (String tipoEnc, String idioma)throws Exception;

    public boolean add(Map collection)throws Exception;

    public boolean addAdmin(Map collection)throws Exception;

    public boolean mod(Map collection)throws Exception;

    public boolean del(String id)throws Exception;
}