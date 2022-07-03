  package com.bocobi.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bocobi.back.models.Compte;
import com.bocobi.back.repos.CompteRepository;

@Service
public class CompteService {
	 @Autowired
	    private CompteRepository compteRepository;

	    public Compte getComptes(final Long idCompte) {
	    	return compteRepository.findById(idCompte).get(); 
	    }

	    public List<Compte> getcomptes() {
	        return compteRepository.findAll();
	    }
	    
	    public List<Compte> getcomptesBylogin(String login) {
	        return compteRepository.findByLogin(login);
	    }
	    
//	    public List<Compte> getcomptesBytypeCompte(String typeCompte) {
//	        return compteRepository.findByTypeCompte(typeCompte);
//	    }
	  
	    public List<Compte> getMedicamentsByIdCompte(Long idCompte) {
	        return compteRepository.findByIdCompte(idCompte);
	    }
	    
	    
//	    public String deleteCompte(final Long idCompte) {
//	       Compte deleteCompte = compteRepository.deleteByIdCompte(idCompte);
//	       
//	       return "Medicament supprimer avec success"+idCompte;
//	    }
//	    

	    public String saveCompte(Compte compte) {
	       Compte saveCompte = compteRepository.save(compte);
	       
	        return "compte enregistrer avec success" +saveCompte;
	    }
	    
//	    @Override
//		public void addRoleToCompte(String username, String rolename) {
//			User user = userRepos.findByusername(username);
//			Role role = roleRepos.findByName(rolename);
//			user.getRoles().add(role);
//		}

	    
	   /* public String updatecompte(@PathVariable (value = "idCompte") Long idCompte , 
				   @RequestBody Compte compte ) {
	    	Compte existingCompte = compteRepository.findByIdCompte(idCompte).orElse(null);
	    	existingCompte.setLogin(compte.getLogin());
	    	existingCompte.setPassword(compte.getPassword());
	    	existingCompte.setTypeCompte(compte.getTypeCompte());
	    	
	    	compteRepository.save(existingCompte);

	    	return "mise a jour effectué avec success";
	    }*/
	    
	  
}
