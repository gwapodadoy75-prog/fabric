# Fabric Mod — Minecraft

A Fabric mod for Minecraft built with Fabric Loom (Java 21, Yarn mappings).

## Requirements

- Java 21
- Gradle (wrapper included via IDE, or install Gradle 8.8+)

## Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/gwapodadoy75-prog/fabric.git
   cd fabric
   ```
2. Generate the Gradle wrapper and import the project into IntelliJ IDEA / Eclipse (recommended: IntelliJ with the Minecraft Development plugin).
3. Run the mod in a dev environment:
   ```bash
   ./gradlew runClient
   ```

## Project structure

```
.
├── build.gradle              # Fabric Loom build script
├── gradle.properties         # Versions (Minecraft, Yarn, Fabric Loader, Fabric API)
├── settings.gradle           # Project name
└── src/main/
    ├── java/                 # Mod source code (entrypoint in net.fabricmc.example)
    └── resources/
        └── fabric.mod.json   # Mod manifest
```

## Mod entrypoint

The mod registers on Fabric's ClientModInitializer and sends a greeting in chat when you join a world/server.

## License

MIT
