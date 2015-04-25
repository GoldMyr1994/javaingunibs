package ing.blog;

public class Blog {
	
	private final String name;
	private final String url;
	//private Post [] listPost;
	
	public Blog(String name, String url) {
		this.name = name;
		this.url = url;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

}
