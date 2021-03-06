package com.birette.service.common;

public interface Converter<E,D>  {

	public D convertToDTO(final E entity) ;
	
	public E convertToEntity(final D dto);
	
}