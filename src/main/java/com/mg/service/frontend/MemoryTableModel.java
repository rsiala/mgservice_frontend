package com.mg.service.frontend;

import com.mg.service.backend.model.Memory;

import javax.swing.table.AbstractTableModel;
import java.util.Date;
import java.util.List;

public class MemoryTableModel extends AbstractTableModel {

	private List<Memory> memories;

	private final String[] entetes = new String[]{
			"Date", "N° Mémoire", "N° Patient", "Montant", "Solde", "Payé par"
	};

	public MemoryTableModel(List<Memory> memories) {
		this.memories = memories;
	}

	public List<Memory> getMemories() {
		return memories;
	}

	@Override
	public int getRowCount() {
		return memories.size();
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

			case 0:
				return memories.get(rowIndex).getInputDate();

			case 1:
				return memories.get(rowIndex).getId();

			case 2:
				return memories.get(rowIndex).getPatientId();

			case 3:
				return memories.get(rowIndex).getAmount();

			case 4:
				return memories.get(rowIndex).getAccount();

			case 5:
				return memories.get(rowIndex).getPaymentType();

			default:
				throw new IllegalArgumentException();
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0:
				return Date.class;
			case 1:
				return Integer.class;
			case 2:
			case 5:
				return String.class;
			case 3:
			case 4:
				return Double.class;

			default:
				return Object.class;
		}
	}

}
