package biblioteca;

import java.util.Objects;

public abstract class DomainObject {
	
	private long id;
	
	public  DomainObject( long id){
		this.id =id;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DomainObject other = (DomainObject) obj;
		return id == other.id;
	}
	
	

}
