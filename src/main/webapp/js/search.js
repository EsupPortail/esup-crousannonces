$(document).ready(function() {
	
	showObjectOnChange('[data-domaine]', '#domaine', 'domaine');
	showObjectOnChange('[data-place]', '[name=typeLieu]', 'place');
	
	$('#savedSearch-field').tooltip();
	
	function showObjectOnChange(listsSelector, elSelector, dataAttr) {
		var $lists     = $(listsSelector),
			$elTrigger = $(elSelector);
		$lists.hide();
		$elTrigger.change(function() {
			var val = this.value;
			$lists.each(function(index) {
				var $el = $(this);
				if($el.data(dataAttr) == val) {
					$el.show();
				} else {
					$el.hide();
				}
			});
		});
	}
	
	var sortOptions = function(a,b) {
		return a.innerHTML >= b.innerHTML ? 1 : -1;
	};
	var $regionSelect = $('#regionCode');
	var $townSelect = $('#townCode');
	
	var sortedRegions = $regionSelect.find('option').sort(sortOptions);
	var sortedTowns = $townSelect.find('option').sort(sortOptions);

	$regionSelect.html(sortedRegions);
	$townSelect.html(sortedTowns);	
});