package com.emforma.academiaPortal.entities.enums;

public enum TipoFisico {
	ECTOMORFO(1),
	MESOMORFO(2),
	ENDOMORFO(3);
	
	private int code;
	
	private TipoFisico(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoFisico valueOf(int code) {
		for (TipoFisico value: TipoFisico.values()) {
			if(value.getCode()== code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo TipoFisico informado Invalidado ");
	}

}
