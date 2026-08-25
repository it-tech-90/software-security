# Software Security

<h1>1. Client and software requirements</h1>
<p>Artemis Financial is a fictitious consulting company that builds individualized financial plans (savings, retirement, investments, insurance) for its customers. They have a public-facing web application and wanted to modernize it while adopting current, effective software seuciryt. The specific issue: they needed a <b>file verification setup (a checksum)</b> added to their web app to ensure secure data communications, plus secure coding to protect client data and financial information</p>

<h1>2. What went well / why securing code matters / value added</h1>

<p>By running a vulnerability report I was able to identify the vulnerabilities by combining automated static analysis (OWASP dependency-check) with manual code review, and I had added integrity and encryption to the code without introducing any new dependencies.</p>
<p>This matters greatly because financial data is high-value and heavily regulated (GLBA, SOX, PCI DSS) and having insecure code exposes clients to data breaches, the company to penalties, and the brand to loss of trust altogether. Secure code protects the company's reputation and is cheaper than remediating a breach after the fact - it ties to Global Rain's (the software consulting firm) mission, "Security is everyone's responsibility".</p>

<h1>Challenging or Helpful</h1>
<p>This project presented quite a few challenges for myself that took some time and dedication to overcome. The biggest challenge, however, was the plugin version mismatch that I had to work through. The old plugin version couldn't reach the retired NVD feeds and needed updating plus an API key (since the API key wasn't recognized by the old version).</p>

<h1>Increased Layers of Security / Future Assessment Approach</h1>

<p>Additional layers I added to the code included an SHA-256 checksum for file integrity, added encryption in transit by converting the session from HTTP to HTTP/TLS with a self-signed cert, and manually incorporated verification with a static analysis and a manual review.</p>

<p>For future assessments, OWASP dependency-check for known-CVE scanning of dependencies will absolutely be used. This helps provide insight into known exploits that shouldn't be overlooked. Additionally, using SAST (Static Application Security Testing) tools such as SonarQube to provide Java static analysis as it provides coverage for Java/Spring architectures and consulting authoritative sources like NVD to decide mitigation strategies.</p>

<h1>Ensuring Functionality</h1>
<p>To ensure functionality I initially ran the application and confirmed the startup was clean confirming it started the Tomcat server on port 8443, tested the <i>/hash</i> endpoint in the browser over HTTPS, and verified the checksum output.</p>
<p>After refactoring the code I re-ran the OWASP dependency-check and confirmed the flagged CVEs were all in the inherited SprintBoot 2.2.4 framework libraries and that my refactoring didn't introduce any new dependencies.</p>

<h1>Resources / Tools / Practices for the Future</h1>
<p>The biggest resource/tool that helped immensely was the OWASP dependency-check with Maven (for build management). This was essential in identifying any dependencies and vulnerabilities. Another tool that is worth mentioning here is Java's built-in <i>MessageDigest</i> for hashing. This made it incredibly easy to hash and create a checksum.</p>

<h1>Artifacts for Future Employers</h1>
<p>The final report titled <b>Practices for Security Software Report</b> (linked in this repo) would be a good artifact to show future employers. This demonstrates my ability to take existing applications, assess it for vulnerabilities, refactor the code to add cryptographic integrity and secure connections, and validate the changes with security testing. The code base is also something that can be utilized to show <i>how</i> it was implemented.</p>