package inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee101")
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorColumn(name = "type", discriminatorType =
// DiscriminatorType.STRING)
// @DiscriminatorValue(value = "employee")

public class Employee {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

@Entity
@Table(name = "regular")
@PrimaryKeyJoinColumn(name = "ID")
class Regular_Employee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Regular_Employee(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}

@Entity
@Table(name = "contract")
// @DiscriminatorValue("contractemployee")
@PrimaryKeyJoinColumn(name = "ID")
class Contract_Employee extends Employee {

	@Column(name = "pay_per_hour")
	private float pay_per_hour;

	@Column(name = "contract_duration")
	private String contract_duration;

	public Contract_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract_Employee(float pay_per_hour, String contract_duration) {
		super();
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

}
