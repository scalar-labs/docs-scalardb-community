// This JavaScript file allows users to press a button to copy content in a code block to a clipboard. (added by josh-wong)
// assets/js/post.js
var codeBlocks = document.querySelectorAll('pre.highlight');

codeBlocks.forEach(function (codeBlock) {
  var copyButton = document.createElement('button');
  copyButton.className = 'copy';
  copyButton.type = 'button';
  copyButton.ariaLabel = 'Copy code to clipboard';
  copyButton.innerText = 'Copy';

  codeBlock.append(copyButton);

  copyButton.addEventListener('click', function () {
    var code = codeBlock.querySelector('code').innerText.trim();
    window.navigator.clipboard.writeText(code);

    copyButton.innerText = 'Copied!';
    var threeSeconds = 3000;

    setTimeout(function () {
      copyButton.innerText = 'Copy';
    }, threeSeconds);
  });
});
