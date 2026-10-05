# AI-Assisted Security-Aware Autoscaling for Kubernetes Microservices

Master's Thesis Project  
Master of Engineering in Computer Science  
GISMA University of Applied Sciences

## Overview

This project investigates an AI-assisted security-aware autoscaling
approach for Kubernetes microservices under simulated DDoS attacks.

The project combines a microservices-based e-commerce application with
Kubernetes autoscaling, Prometheus monitoring, AI-based DDoS detection,
and controlled traffic generation.

## Research Objective

The main objective is to investigate whether DDoS detection information
can be integrated into the Kubernetes autoscaling process to reduce
unnecessary resource provisioning while maintaining acceptable
performance for legitimate users.

## Technology Stack

- React.js
- Java
- Spring Boot
- MySQL
- MongoDB
- Docker
- Kubernetes
- Prometheus
- Kubernetes HPA
- Python
- k6
- Terraform
- AWS

## Project Structure

```text
frontend/       React.js application
backend/        Spring Boot microservices
database/       Database configuration
docker/         Docker configuration
kubernetes/     Kubernetes manifests
terraform/      Infrastructure as Code
ai/             AI/DDoS detection components
experiments/    Traffic generation and experiments
docs/           Documentation
scripts/        Supporting scripts
