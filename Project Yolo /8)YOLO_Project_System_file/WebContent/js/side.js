$(document).ready(function() {

	   // ���� css���� �÷��� ��� ��ġ(top)���� ������ �����Ѵ�.
	   var floatPosition = parseInt($("#floatMenu").css('top'));
	   // 250px �̷������� �������Ƿ� ���⼭ ���ڸ� �����´�. parseInt( �� );

	   $(window).scroll(function() {
	      // ���� ��ũ�� ��ġ�� �����´�.
	      var scrollTop = $(window).scrollTop();
	      var newPosition = scrollTop + floatPosition + "px";

	      /* �ִϸ��̼� ���� �ٷ� ����
	       $("#floatMenu").css('top', newPosition);
	       */

	      $("#floatMenu").stop().animate({
	         "top" : newPosition
	      }, 500);

	   }).scroll();

	});