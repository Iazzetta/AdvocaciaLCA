<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Advocacia LCA</title>
	<meta http-equiv="cache-control" content="no-cache">
	
    <script type="text/javascript" src="plugins/jquery-ui-1.10.4/js/jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="plugins/jquery-ui-1.10.4/css/dark-hive/jquery-ui.min.css" />
	<script type="text/javascript" src="plugins/jquery-ui-1.10.4/js/jquery-ui-1.10.4.min.js"></script>
    <link rel="stylesheet" href="plugins/jquery-ui-1.10.4/css/dark-hive/jquery.ui.theme.css" />

    <script type="text/javascript" src="plugins/datatables/js/jquery.dataTables.js"></script>
    <link rel="stylesheet" href="plugins/datatables/css/jquery.dataTables.min.css" />
    <script type="text/javascript" src="plugins/datatables/js/dataTables.jqueryui.js"></script>
    <link rel="stylesheet" href="plugins/datatables/css/jquery.dataTables_themeroller.min.css" />
    <link rel="stylesheet" href="plugins/datatables/css/dataTables.jqueryui.css" />
	
    <script type="text/javascript" src="plugins/jquery.maskedinput.min.js"></script>
	
    <link rel="stylesheet" href="css/LCA_adv.css" />
    <script type="text/javascript" src="js/LCA_Adv.js"></script>
    <script type="text/javascript" src="js/LCA_WebDB.js"></script>
    <script type="text/javascript" src="js/LCA_WebDBInit.js"></script>
</head>
<body>
    <div id="cabecalho">
        <span class="logo"><img src="img/logo.png" alt="Logo LCA" /></span>
        <span class="titulo"><span>Consulta de Processos</span></span>
        <span class="anotacao"><span>Pokemon - 1.o TDSS</span></span>
        <div>
            <ul id="menu">
                <li><a href="consultarProcessos">Home</a></li>
                <li><a href="consultarProcessos"><img src="img/search.png" alt="Consultar Lancamentos" class="icone" /> Consultar Processos</a></li>
                <!-- <li><a href="cadastrarProcesso.jsp"><img src="img/notification_add.png" alt="Consultar Lancamentos" class="icone" /> Cadastrar Processo</a></li>-->
                <li><a href="cadastrarDespesa"><img src="img/file_add.png" alt="Nova Despesa" class="icone" /> Cadastrar Despesa</a></li>
                <li><a href="cadastrarHonorario"><img src="img/document_add.png" alt="Novo Honorario" class="icone" /> Cadastrar Honorário</a></li>
            </ul>
        </div>
    </div>