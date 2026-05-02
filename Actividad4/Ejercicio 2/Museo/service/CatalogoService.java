package service;

import model.Museo;
import model.Obra;

import java.util.List;

public class CatalogoService {
    private Museo museo;

    public CatalogoService(Museo museo) {
        this.museo = museo;
    }

    public List<Obra> listarObras() {
        return museo.getObras();
    }
}
