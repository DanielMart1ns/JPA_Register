/**
 * 
 */
/**
 * 
 */
module Product_JPA {
	requires java.persistence;
	requires junit;
	
	requires org.hibernate.orm.core;
    opens br.com.daniel.domain to org.hibernate.orm.core;
}