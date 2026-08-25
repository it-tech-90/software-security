# Software Security

<h1>1. Client and software requirements</h1>
<p>Artemis Financial is a fictitious consulting company that builds individualized financial plans (savings, retirement, investments, insurance) for its customers. They have a public-facing web application and wanted to modernize it while adopting current, effective software seuciryt. The specific issue: they needed a <b>file verification setup (a checksum)</b> added to their web app to ensure secure data communications, plus secure coding to protect client data and financial information</p>

<h1>2. What went well / why securing code matters / value added</h1>

<p>By running a vulnerability report I was able to identify the vulnerabilities by combining automated static analysis (OWASP dependency-check) with manual code review, and I had added integrity and encryption to the code without introducing any new dependencies.</p>
<p>This matters greatly because financial data is high-value and heavily regulated (GLBA, SOX, PCI DSS) and having insecure code exposes clients to data breaches, the company to penalties, and the brand to loss of trust altogether. Secure code protects the company's reputation and is cheaper than remediating a breach after the fact - it ties to Global Rain's (the software consulting firm) mission, "Security is everyone's responsibility".</p>

<h1>Challenging or Helpful</h1>
<p>This project presented quite a few challenges for myself that took some time and dedication to overcome. The biggest challenge, however, was the plugin version mismatch that I had to work through. The old plugin version couldn't reach the retired NVD feeds and needed updating plus an API key (since the API key wasn't recognized by the old version).</p>

<h1>Increased Layers of Security / Future Assessment Approach</h1>
