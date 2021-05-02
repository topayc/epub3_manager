package com.ahn.abms.dao.mapper;

import java.util.ArrayList;

import com.ahn.abms.model.A3MakerUserResource;

public interface A3MakerUserResourceMapper {
	public ArrayList<A3MakerUserResource> getA3MakerUserResources(A3MakerUserResource a3MakerUserResource);
	public void insertA3MakerUserResource(A3MakerUserResource a3MakerUserResource);
	public void updateA3MakerUserResource(A3MakerUserResource a3MakerUserResource);
	public void deleteA3MakerUserResource(A3MakerUserResource a3MakerUserResource);
}