# SimGuardian: SIM Swap Fraud Detection for South Africa  

A Java-based backend system that detects unauthorized SIM card changes (common in SA banking fraud) and sends real-time SMS alerts to users. Built for MTN/Vodacom networks with:  

- **SIM ICCID Tracking**: Detects fraudulent swaps via carrier APIs.  
- **Twilio Integration**: Instant SMS/WhatsApp alerts.  
- **Spring Boot Backend**: Scalable and secure.  

**Problem Solved**: South Africa loses over **R300M/year** to SIM swap scams. This project helps users secure their phone numbers linked to bank accounts.  

**Use Case**:  
1. User registers their phone number.  
2. System polls carriers for SIM changes.  
3. If a swap is detected → SMS alert + account freeze request.  
