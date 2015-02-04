(function($){
    function qstring(name) {
        name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
            results = regex.exec(location.search);
        return results == null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
    }
    $.qstring = qstring;
})(jQuery);

function buscarProcesso(){
	var numero_Processo = $("#numero_Processo").val();
	var cliente = $("#cliente").val();
	var dataDe = $("#dataDe").val();
	var dataAte = $("#dataAte").val();
	
	carregarProcessos( numero_Processo, cliente, dataDe, dataAte );
}
function NovaDespesa(id){
	location.href = "cadastrarDespesa.jsp?proc=" + id;
}
function NovoHonorario(id){
	location.href = "cadastrarHonorario.jsp?proc=" + id;
}
function MostrarLancamentos(id){
	carregarDespesas(id);
	carregarHonorarios(id);
	var $d = $("#dialogDetalhes");
	$d.dialog({ 
		modal: true,
		width: "90%",
		title: "Despesas e Honorários"
	});
}
function EditarProcesso(id){
	location.href = "cadastrarProcesso.jsp?id=" + id;
}
function EditarDespesa(id){
	location.href = "cadastrarDespesa.jsp?id=" + id;
}
function EditarHonorario(id){
	location.href = "cadastrarHonorario.jsp?id=" + id;
}
function ExcluirDespesa(id){
	if(confirm("Deseja realmente excluir esta despesa?")){
		excluirDespesaDB(id);
	}
}
function ExcluirHonorario(id){
	if(confirm("Deseja realmente excluir esta custa de honorário?")){
		excluirHonorarioDB(id);
	}
}