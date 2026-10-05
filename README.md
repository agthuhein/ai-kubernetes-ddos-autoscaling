# AI-Assisted Security-Aware Autoscaling for Kubernetes Microservices

Master's Thesis Project  
**Master of Engineering in Computer Science**  
**GISMA University of Applied Sciences**

---

## Overview

This project investigates an **AI-assisted security-aware autoscaling approach**
for Kubernetes microservices under simulated Distributed Denial-of-Service
(DDoS) attacks.

The project will develop a simple e-commerce application using a
microservices architecture. The application will be containerized with
Docker and deployed on Kubernetes.

The research will investigate whether DDoS detection information can be
integrated into the Kubernetes autoscaling process to reduce unnecessary
resource provisioning while maintaining acceptable performance for
legitimate users.

---

## Research Objective

The main objective of this research is to evaluate whether an AI-based
DDoS detection mechanism can provide additional security information to
Kubernetes autoscaling and improve scaling decisions during simulated
DDoS attacks.

The proposed approach will be compared with standard Kubernetes
Horizontal Pod Autoscaler (HPA).

---

## Research Questions

### RQ1 — DDoS Detection

Can an existing DDoS detection model be adapted to identify simulated
DDoS traffic in a Kubernetes microservice environment?

### RQ2 — Autoscaling Efficiency

Can integrating the AI-based DDoS detection result into Kubernetes
autoscaling reduce unnecessary pod provisioning compared with standard HPA?

### RQ3 — Application Performance

What effect does the proposed approach have on latency and SLA violations
for legitimate users during a simulated DDoS attack?

---

## Research Approach

The experimental evaluation will compare two autoscaling approaches:

### 1. Standard Kubernetes HPA

Standard Kubernetes Horizontal Pod Autoscaler will be used as the
baseline autoscaling mechanism.

### 2. AI-Assisted Security-Aware Autoscaling

The proposed approach will use an AI-based DDoS detection result as an
additional input to the autoscaling decision.

### 3. Experimental Scenarios

The system will be evaluated under different traffic conditions:

- Normal traffic
- Legitimate traffic surge
- Simulated DDoS traffic
- Mixed legitimate and DDoS traffic

---

## System Architecture

The project will use a microservices-based e-commerce application
deployed on Kubernetes.

The planned architecture is:

```text
                         React.js Frontend
                                |
                                v
                         API Gateway
                                |
              +-----------------+-----------------+
              |                 |                 |
              v                 v                 v
       Product Service    Order Service     User Service
              |                 |                 |
              v                 v                 v
           MySQL             MySQL            MongoDB
              |                 |                 |
              +-----------------+-----------------+
                                |
                                v
                           Kubernetes
                                |
                +---------------+---------------+
                |                               |
                v                               v
             Prometheus                    Kubernetes HPA
                |
                v
        DDoS Detection Model
                |
                v
        Scaling Controller
                |
                v
         Kubernetes API
                |
                v
              HPA
