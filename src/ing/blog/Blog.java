package ing.blog;

import ing.myUtil.StringOperations;

public class Blog {
	
	private final String name;
	private final String url;
	//private Post [] listPost;
	
	public Blog(String name, String url) {
		this.name = name.toLowerCase();
		this.url = url.toLowerCase();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return StringOperations.CapitalizeFirstLetter(this.name);
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

}
