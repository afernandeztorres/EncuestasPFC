package com.aft.encuestas.dao.core;

import java.util.List;
import java.util.Map;


public interface MyDaoDefault {

    public void connect () throws Exception;


    public List findEncuesta (String id, String idioma) throws Exception;

    public List findTipoEncuesta (String idioma) throws Exception;

    public List findSubTipoEncuesta (String filter, String idioma) throws Exception;

    public List findPreguntas (String filter) throws Exception;

    public List findRepuestas (String filter, String idioma)throws Exception;

    public int add (Map collection)throws Exception;

    public int modRadio (String id, String value) throws Exception;

    public int modPre (String id, String value) throws Exception;

    public int addEncAdmin (String tipo, String subTipo, String idioma, String fechaCad) throws Exception;

    public int addPreAdmin (String idEnc, String pre, String idioma)throws Exception;

    public int addResAdmin (String idPre, String res, String idioma)throws Exception;

    public int delete (String idPregunta)throws Exception;
}