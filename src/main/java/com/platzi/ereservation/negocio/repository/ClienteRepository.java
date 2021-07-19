/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * @author brend
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

	public List<Cliente> findByApellidoCli(String apellidoCli);

	public Cliente findByIdentificacion(String identificacionCli);

	@Query("Select c from Cliente c where c.emailCli like %:email")
	public Cliente findByEmailAccount(@Param("email") String email);
	
}
