document.addEventListener('DOMContentLoaded', function() {
  const baseUrl = 'https://scalardb.scalar-labs.com'; // Base URL for redirection
  // Redirect happens immediately. Otherwise, we can use the following to specify seconds.
  // const redirectTime = 10000; // 10,000 milliseconds = 10 seconds

  // Create and style the overlay element.
  const overlay = document.createElement('div');
  overlay.style.position = 'fixed';
  overlay.style.top = '0';
  overlay.style.left = '0';
  overlay.style.width = '100%';
  overlay.style.height = '100%';
  overlay.style.backgroundColor = 'rgba(211, 211, 211, 0.8)'; // Light gray with opacity
  overlay.style.zIndex = '1000';
  overlay.style.display = 'flex';
  overlay.style.justifyContent = 'center';
  overlay.style.alignItems = 'center';

  // Create and style the popup element.
  const popup = document.createElement('div');
  popup.style.backgroundColor = '#fff';
  popup.style.color = '#000';
  popup.style.padding = '20px';
  popup.style.borderRadius = '8px';
  popup.style.boxShadow = '0 4px 8px rgba(0,0,0,0.2)';
  popup.style.position = 'relative';
  popup.style.zIndex = '1001';
  popup.style.textAlign = 'center';

  // Add message to the popup.
  popup.innerHTML = 'The ScalarDB Community docs site has been merged with the <a href="https://scalardb.scalar-labs.com/docs/latest/">ScalarDB docs site</a>.';

  // Append popup to overlay.
  overlay.appendChild(popup);

  // Append overlay to body.
  document.body.appendChild(overlay);

  // Get current path.
  const currentPath = window.location.pathname;

  // Set timeout for redirect
  setTimeout(function() {
    window.location.href = `${baseUrl}${currentPath}`;
  },); // Redirect happens immediately. Otherwise, we can specify `redirectTime);` at the end of this line.
});
