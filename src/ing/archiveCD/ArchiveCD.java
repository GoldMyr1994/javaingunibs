package ing.archiveCD;

import java.util.Vector;

public class ArchiveCD {

	private final Vector<CD> archiveCD;
	
	public ArchiveCD() {
		this.archiveCD = new Vector<CD>();
	}
	
	public ArchiveCD(CD ... CDs) {
		this();
		for(CD e : CDs) this.archiveCD.add(e);
	}
	
	public void addCD(CD e) {
		this.archiveCD.add(e);
	}
	
	public String itemToString(int index) {
		return this.archiveCD.get(index).toString();
	}

	public String removeItem(int index) {
		return this.archiveCD.get(index).toString();
	}
	
	public int getArchiveLenght() {
		return archiveCD.size();
	}
	
	public boolean hasCD(String title) {
		boolean result = false;
		if(archiveCD.size()>0) {
			for(CD item : archiveCD) {
				if(item.getTitle().equals(title)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public CD selectCD(String title) {
		
		CD cd = null;
		if(hasCD(title)) {
			if(archiveCD.size()>0) {
				for(CD item : archiveCD) {
					if(item.getTitle().equals(title)) {
						cd = item;
					}
				}
			}
		}
		return cd;
	}
	 
	public void deleteCD(String title) {
		int i = 0;
		for(CD current : archiveCD) {
			if(current.hasTitle(title)) {
				archiveCD.remove(i);
				break;
			}
			i++;
				
		}
	}
	
	public Track selectRandomTrack() {
		int indexRandomCD = (int)(Math.random()*(archiveCD.size()-1));
		return archiveCD.get(indexRandomCD).selectRandomTrack();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String _toString = "";
		_toString += "ARCHIVIO:";
		if(archiveCD.size()>0) {
			for(CD cd : archiveCD) _toString += "\n"+cd.toString();
		} 
		return _toString;
	}

	
}
