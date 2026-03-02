package entities;

public interface Transactional {
	
	Double deposit(Double amount);
	Double transfer(Double amount);
}
