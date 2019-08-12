// ==UserScript==
// @name     hide codechef solved problems
// @include  /^https://www.codechef.com/problems/(school|easy|medium|hard|challenge|extcontest)/
// @version  1
// @require  https://code.jquery.com/jquery-3.4.1.min.js
// @grant    none
// ==/UserScript==

$(function() {
  let $allProblems = $('a').filter(function() {
    return /^\/problems\/[A-Z]/.test($(this).attr('href'));
  });

  let $solvedProblems = $allProblems.filter(function() {
    return $(this).css('color') === 'rgb(0, 128, 0)';
  });

  $solvedProblems.each(function() {
    $(this)
      .closest('tr')
      .hide();
  });

  $('table.dataTable').prepend(
    `<caption style="background-color: yellow"><h3>Filtered Results (Solved: ${
      $solvedProblems.length
    } / ${$allProblems.length})</h3></caption>`
  );
});
