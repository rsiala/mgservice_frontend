/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mg.service.frontend;

import com.mg.service.backend.model.Memory;
import com.mg.service.backend.service.MemoryService;
import com.mg.service.backend.service.impl.MemoryServiceImpl;

import java.util.List;

/**
 *
 * @author damak
 */
public class Controller {

	private MemoryService memoryService = new MemoryServiceImpl();

	private List<Memory> memories;

	public List<Memory> getMemories() {
		return memories;
	}

	public void loadMemoriesFromFile(String filePath){
		memories = memoryService.loadMemoriesFromFile(filePath);
	}
    
}
