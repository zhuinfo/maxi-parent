package cn.maximus.module.function;

import org.springframework.transaction.annotation.Transactional;

/**
 * THIS IS A SAMPLE MAPPING
 * @author 陆阳
 *
 */
public interface SampleMapping {
	
	public void create();
	
	public void add(String text);
	
	@Transactional
	public void batchAdd(String text);
	
	public void update(String text);
	
	public void delete(int id);
	
	public String get(int id);

}
