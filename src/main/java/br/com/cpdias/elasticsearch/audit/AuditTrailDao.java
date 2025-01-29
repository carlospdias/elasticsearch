package br.com.cpdias.elasticsearch.audit;

interface AuditTrailDao {
	void gravar();
	
	void listar();
}
