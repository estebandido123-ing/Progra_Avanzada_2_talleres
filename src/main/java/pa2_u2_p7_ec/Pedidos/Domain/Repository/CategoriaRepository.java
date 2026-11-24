package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import pa2_u2_p7_ec.Pedidos.Domain.Model.Categoria;

public interface CategoriaRepository {

    public void crear(Categoria categoria);

    public Categoria read(Integer id);

    public void update(Categoria categoria);

    public void delete(Integer id);
}

