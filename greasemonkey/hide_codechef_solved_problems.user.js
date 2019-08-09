// ==UserScript==
// @name     hide codechef solved problems
// @include  /^https://www.codechef.com/problems/(school|easy|medium|hard|challenge|extcontest)/
// @version  1
// @require  https://code.jquery.com/jquery-3.4.1.min.js
// @grant    none
// ==/UserScript==

$(function() {
  $('table.dataTable').prepend(
    '<caption style="background-color: yellow"><h3>Filtered Results</h3></caption>'
  );

  let $solvedProblems = $('a').filter(function() {
    return (
      $(this).attr('href') &&
      $(this)
        .attr('href')
        .startsWith('/problems/') &&
      $(this).css('color') === 'rgb(0, 128, 0)'
    );
  });

  $solvedProblems.each(function() {
    $(this)
      .closest('tr')
      .hide();
  });
});
