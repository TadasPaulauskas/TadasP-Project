package lt.codeacademy.tadasproject.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Product Model
 * 
 * @author TadasP
 *
 */
@Data
@Entity
@Table(name = "product")
public class Product {
	/**
	 * Product model
	 * 
	 * @param id, name, description, price, createTime
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * id auto generated
	 */
	@Column(name = "name", nullable = false)
	private String name;
	/**
	 * name setName() and getName() (lombok)
	 */
	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "create_time", nullable = false)
	private LocalDateTime createTime;

	// @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	// private Set<Purchase> purchaseList;
}
