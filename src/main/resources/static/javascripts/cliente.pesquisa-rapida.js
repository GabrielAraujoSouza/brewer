var Brewer = Brewer || {};

Brewer.PesquisaRapidaCliente = (function(){
	
	function PesquisaRapidaCliente(){
		this.pesquisaRapidaClientesModal = $('#pesquisaRapidaClientes');
		//js-pesquisa-rapida-clientes-btn
	}
	
	PesquisaRapidaCliente.prototype.iniciar = function(){
		$.ajax({
			url: this.pesquisaRapidaClientesModal.find('form').attr('action'),
			method: 'GET',
			contentType: 'application/json',
			data: {
				nome: 'joao'
			}
		})	
	}
	
	return PesquisaRapidaCliente;
	
}());

$(function(){
	var pesquisaRapidaCliente = new Brewer.PesquisaRapidaCliente()
	pesquisaRapidaCliente.iniciar();
});
