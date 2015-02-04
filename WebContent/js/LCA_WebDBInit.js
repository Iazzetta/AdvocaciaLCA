/* INICIALIZADOR DE BANCO DE DADOS LOCAL */
function loadInitDB(){
	if (!supportsLocalStorage()) { alert("Sem suporte a localStorage. Tente um browser de verdade! =)"); return false; }
	else{
		if(!localStorage["clientes.count"]){
			localStorage["clientes.count"] = 0;
			AddGeneric("clientes","Eduardo Gondo");
			AddGeneric("clientes","Leonardo Akira");
			AddGeneric("clientes","Thiago Yama");
			AddGeneric("clientes","Elisa Midori");
			AddGeneric("clientes","Henrique Neto");
			AddGeneric("clientes","Jefferson Santos");
		}
		if(!localStorage["advogados.count"]){
			localStorage["advogados.count"] = 0;
			AddGeneric("advogados","Alvaro Barbosa");
			AddGeneric("advogados","Erick de Camargo");
			AddGeneric("advogados","Vitor Cintra");
		}
		if(!localStorage["processos.count"]){
			localStorage["processos.count"] = 0;
			AddProcesso(3,2,"0031032-06.2012.8.26.0001","Planos de Saude - Contra Porto Seguro Saude","23/06/2012","19/08/2013","1","2","2","Autor: Erick de Camargo Silva;\r\nADV: THEREZA MAIA BARBOSA DA SILVA")
		}
		if(!localStorage["despesas.count"]){
			localStorage["despesas.count"] = 0;
		}
		if(!localStorage["honorarios.count"]){
			localStorage["honorarios.count"] = 0;
		}
		
		if(!localStorage["situacoes.count"]){
			localStorage["situacoes.count"] = 0;
			AddGeneric("situacoes","Liberado");
			AddGeneric("situacoes","Bloqueado");
		}
		if(!localStorage["resultados.count"]){
			localStorage["resultados.count"] = 0;
			AddGeneric("resultados","Em Andamento");
			AddGeneric("resultados","Causa Ganha");
			AddGeneric("resultados","Causa Perdida");
		}
		if(!localStorage["tipos_despesa.count"]){
			localStorage["tipos_despesa.count"] = 0;
			AddGeneric("tipos_despesa","Xerox");
			AddGeneric("tipos_despesa","Suborno");
		}
		if(!localStorage["tipos_tarefa.count"]){
			localStorage["tipos_tarefa.count"] = 0;
			AddGeneric("tipos_tarefa","Audiencia");
			AddGeneric("tipos_tarefa","Delegacia");
			AddGeneric("tipos_tarefa","Estudo de caso");
		}
	}
}
loadInitDB();