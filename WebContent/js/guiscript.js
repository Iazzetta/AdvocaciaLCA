/**
 * Script para transformar texto em Input, para atualizar sem sair da pagina
 */

$('#tipodespesa').click(function(){
    $this = $(this)
    $this.replaceWith( $('<input />').val( $this.text()) )
})