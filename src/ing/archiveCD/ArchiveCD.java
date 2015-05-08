package ing.archiveCD;

import java.util.Vector;

public class ArchiveCD {

	private final Vector<CD> archiveCD;
	
	public ArchiveCD() {
		this.archiveCD = new Vector<CD>();
	}
	
	public ArchiveCD(CD e) {
		this();
		this.archiveCD.add(e);
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
	
	public void removeCD(String title) {

	}
	
//	public selectRandomTrack(int index) {
//		return this.archiveCD.get(index).toString();
//	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArchiveCD [archiveCD=" + archiveCD + "]";
	}

	
}
