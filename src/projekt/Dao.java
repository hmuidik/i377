package projekt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projekt.Unit;

public class Dao extends AbstractDao {
	
	
	public List<Unit> findAllUnits() throws SQLException {
		
	    List<Unit> units = new ArrayList<Unit>();
		
		try {
	        
	        st = getConnection().createStatement();
	        rs = st.executeQuery("SELECT * FROM unit");
	        while(rs.next()){
	        	Unit unit = new Unit();
	        	unit.setId(rs.getInt(1));
	        	unit.setName(rs.getString(2));
	        	unit.setCode(rs.getString(3));
	        	units.add(unit);
	        }
	        
	    } finally {
	        closeResources();
	    }
		
		return units;
	}
	
	
	public void addUnit(Unit unit) throws SQLException {
		
		try {
			pst = getConnection().prepareStatement("INSERT INTO unit VALUES (NEXT VALUE FOR seq1, ?, ?);");
			pst.setString(1, unit.getName());
			pst.setString(2, unit.getCode());
			pst.executeUpdate();
			
		} finally {
			closeResources();
		}
		
	}
	
	public List<Unit> findUnitsByName(String name) throws SQLException{
		
		List<Unit> units = new ArrayList<Unit>();
		
		try {
			pst = getConnection().prepareStatement("SELECT * FROM unit WHERE UPPER(name) LIKE UPPER(?)");
			pst.setString(1, "%" + name + "%");
			rs = pst.executeQuery();
			
			while(rs.next()){
				Unit unit = new Unit();
				unit.setId(rs.getInt(1));
	        	unit.setName(rs.getString(2));
	        	unit.setCode(rs.getString(3));
	        	units.add(unit);
			}
			
		} catch (Exception e) {
			closeResources();
		}
		
		return units;
		
	}
	
	
	public void deleteData() throws SQLException {
		
		try {
			st = getConnection().createStatement();
			st.executeUpdate("DELETE from unit");
		} finally {
			closeResources();
		}
		
	}
	
	public void removeUnit(String id) throws SQLException {
		
		int uid = Integer.parseInt(id);
		try {
			pst = getConnection().prepareStatement("DELETE FROM unit WHERE id=?");
			pst.setInt(1, uid);
			pst.executeUpdate();
			
		} finally {
			closeResources();
		}
		
		
	}
	

}
