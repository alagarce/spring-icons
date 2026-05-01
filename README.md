# 🌱 Spring Icons — IntelliJ Plugin

**Clean, modern, color‑coded icons for Spring Boot projects**

Spring Icons is an IntelliJ IDEA plugin that enhances the readability of Spring Boot and Java
projects by applying **custom, meaningful, color‑coded icons** to files and folders based on their
role in the application architecture.

It brings instant visual clarity to large codebases by making controllers, services, repositories,
DTOs, models, configs, tests, mocks, and more immediately recognizable.

---

## ✨ Features

### 🔹 Smart file icon detection

Automatically assigns icons based on filename patterns:

- `*Controller.java` → Controller icon
- `*Service.java` → Service icon
- `*Repository.java` → Repository icon
- `*Mapper.java`, `*Utils.java` → Mapper icon
- `*Dto.java`, `*Record.java` → DTO icon
- `*Entity.java`, `*Model.java` → Model icon
- `*Config.java` → Config icon
- `*Exception.java` → Error icon
- `*Test.java` → Test icon
- `Mock*`, `Fake*`, `Stub*` → Mock icon
- And many more…

All regex rules are centralized and fully configurable.

---

### 🔹 Smart folder icon detection

Folders are also recognized based on their path:

- `/controller/`
- `/service/`
- `/repository/`
- `/model/`, `/entity/`, `/domain/`
- `/dto/`
- `/config/`
- `/security/`
- `/validator/`
- `/event/`
- `/scheduler/`
- `/shared/`, `/common/`
- `/resources/`
- `/test/`, `/tests/`
- `/src/`, `/app/`
- Hidden folders (`/.git`, `/build`, `/target`)

Each folder type gets its own icon and color.

---

### 🔹 Class‑type awareness

The plugin detects Java PSI elements and adapts icons accordingly:

- **Interfaces** → interface icon set
- **Abstract classes** → icon with transparency (AlphaIcon)
- **Records** → dedicated record icon
- **Mocks / Fakes / Stubs** → mock icon
- **Default classes** → default icon

---

### 🔹 Color‑coded icon sets

Each Spring layer has its own color palette:

- Controllers → Red
- Services → Blue
- Repositories → Purple
- Models → Blue‑gray
- DTOs → Cyan
- Config → Yellow
- Security → Orange
- Tests → Green
- Mocks → Violet
- Records → Light cyan

All icons are custom SVGs optimized for IntelliJ’s dark themes.

---

## 📦 Installation

### Option 1 — Install from ZIP (local install)

1. Generate the plugin ZIP:
   ```bash
   ./gradlew buildPlugin
