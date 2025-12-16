public interface Usuriorepositoy {

	/**
	 * 
	 * @param Usuario
	 */
	void save(usuario Usuario);

	/**
	 * 
	 * @param Lojg
	 */
	void deletById(id Lojg);

	/**
	 * 
	 * @param Long
	 */
	void findById(id Long);

	void findAll();

}