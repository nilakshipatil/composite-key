package demo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

@Entity
@Table(name="mytable")
public class Emp{

		@EmbeddedId
		private EmpPk emppk;
		
		@Embedded
		private Address address;
		
		public EmpPk getEmppk() {
			return emppk;
		}

		public void setEmppk(EmpPk emppk) {
			this.emppk = emppk;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		
		
		
				
}
