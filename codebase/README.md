# Hiking Journal

A full-stack multi-platform application for tracking and managing hiking adventures. This repository contains the complete codebase for a Rails API backend with native iOS (Swift) and Android (Kotlin) mobile applications.

## 📱 Overview

Hiking Journal is a comprehensive mobile application that allows users to:
- Track hiking adventures and trails
- Record hiking details, photos, and memories
- Browse and manage hiking history
- Sync data across platforms via a Rails API

## 🏗️ Architecture

This project follows a **multi-platform architecture** with:

- **Backend**: Ruby on Rails 8.0 API
- **iOS**: Native Swift application using Xcode
- **Android**: Native Kotlin application using Jetpack Compose

### Technology Stack

#### Rails Backend
- **Ruby**: 3.4.4
- **Rails**: 8.0.0
- **Database**: SQLite3
- **Authentication**: BCrypt
- **Image Processing**: Active Storage with image_processing gem
- **API**: RESTful JSON API

#### iOS Application
- **Language**: Swift
- **Project**: HikingJournal.xcodeproj
- **Minimum iOS**: (Check project settings)
- **Architecture**: SwiftUI/UIKit

#### Android Application
- **Language**: Kotlin
- **Build System**: Gradle (Kotlin DSL)
- **Package**: com.masilotti.hikingjournal
- **Architecture**: Jetpack Compose

## 📂 Repository Structure

```
codebase/
├── docs/
│   ├── README.md           # Documentation overview
│   └── setup/
│       ├── README.md       # Setup guide documentation
│       └── index.html      # Interactive setup guide (open in browser)
└── code/
    ├── assets/             # Shared assets (AppIcon, etc.)
    ├── ch01_XX/            # Chapter 1: Project setup and basics
    ├── ch02_XX/            # Chapter 2: Core features
    ├── ch03_XX/            # Chapter 3: API integration
    ├── ch04_XX/            # Chapter 4: Authentication
    ├── ch05_XX/            # Chapter 5: Image handling
    ├── ch06_XX/            # Chapter 6: Advanced features
    ├── ch07_XX/            # Chapter 7: UI enhancements
    ├── ch08_XX/            # Chapter 8: Performance & optimization
    ├── ch09_XX/            # Chapter 9: Testing
    └── ch10_XX/            # Chapter 10: Deployment & polish
```

### Chapter Organization

This repository contains **257 code snapshots** organized across **10 chapters**, representing progressive development stages of the application. Each chapter directory (e.g., `ch01_01`, `ch02_15`) contains a complete, runnable version of the app at that specific point in development.

Each chapter directory typically includes:
- `ios/` - iOS application code
- `android/` - Android application code (from Chapter 2 onwards)
- `rails/` - Rails API backend
- `bin/` - Helper scripts
- `.tool-versions` - Version management files

## 🚀 Getting Started

### Prerequisites

Before setting up the project, ensure you have the following installed:

#### For Rails Backend:
- Ruby 3.4.4
- Bundler
- SQLite3
- Node.js (for asset compilation)

#### For iOS Development:
- macOS with Xcode 14+
- CocoaPods (if used)
- iOS Simulator or physical device

#### For Android Development:
- Android Studio
- JDK 17+
- Android SDK 33+
- Gradle 8.0+

### Setup Instructions

For comprehensive setup instructions, including VS Code extensions, Claude Code plugins, and development workflows, see our **[Interactive Setup Guide](docs/setup/index.html)**:

```bash
open docs/setup/index.html
```

The guide covers:
- VS Code configuration and extensions
- Claude Code CLI and AI plugins
- Rails stack with Maquina tools
- React/Next.js with TypeScript and Tailwind
- Product management workflows with MVP Creator

Or follow the quick setup below:

#### 1. Choose a Chapter

Navigate to the chapter you want to work with:

```bash
cd code/ch01_01  # For the first chapter
# or
cd code/ch10_68  # For the latest version
```

#### 2. Rails Backend Setup

```bash
cd rails
bundle install
bin/rails db:setup
bin/rails server
```

The API will be available at `http://localhost:3000`

#### 3. iOS Setup

```bash
cd ios
open HikingJournal.xcodeproj
```

- Select your development team in Xcode
- Choose a simulator or connected device
- Press ⌘+R to build and run

#### 4. Android Setup

```bash
cd android
./gradlew build
```

Or open the `android` folder in Android Studio and run the app.

## 🔧 Development

### Running Tests

#### Rails
```bash
cd rails
bin/rails test
```

#### iOS
Run tests in Xcode with ⌘+U

#### Android
```bash
cd android
./gradlew test
```

### Database Management

```bash
cd rails
bin/rails db:migrate      # Run migrations
bin/rails db:seed         # Seed database
bin/rails db:reset        # Reset database
```

### API Endpoints

The Rails backend provides RESTful endpoints for:
- User authentication
- Hiking trail CRUD operations
- Photo uploads and management
- User profile management

(Refer to `rails/config/routes.rb` for complete API documentation)

## 📖 Learning Path

This repository is structured as a progressive tutorial. It's recommended to:

1. **Start with Chapter 1** (`ch01_01`) to understand the initial setup
2. **Progress sequentially** through chapters to see how features are added
3. **Compare chapters** to understand specific changes and implementations
4. **Use the latest chapter** (`ch10_68`) for the most complete version

Each chapter builds upon the previous one, introducing new features, refactoring, or improvements.

## 🛠️ Project Tools

### Version Management

The project uses `.tool-versions` files (compatible with `asdf`) to manage:
- Ruby versions
- Node.js versions
- Other development tools

### Git Ignore

Each sub-project has its own `.gitignore` file configured for:
- iOS: Xcode user data, build artifacts, DerivedData
- Android: build outputs, .gradle, .idea
- Rails: logs, tmp, node_modules, database files

## 📝 Notes

- **Database**: Each chapter uses SQLite for simplicity. For production, consider PostgreSQL.
- **Environment Variables**: Check `secrets.properties` (Android) and environment configs for API keys.
- **API Communication**: Mobile apps communicate with the Rails backend via HTTP/JSON.
- **Asset Management**: Shared assets are in the `code/assets/` directory.

## 📚 Documentation

### Interactive Setup Guide

The [docs/setup/](docs/setup/) directory contains a comprehensive interactive HTML guide for setting up your complete development environment:

**Open the guide**: `open docs/setup/index.html`

The guide includes:
- **VS Code Setup** - Extensions for Rails, React, and Tailwind CSS
- **Claude Code CLI** - AI coding assistant with plugins
- **Rails Stack** - Maquina tools, 37signals patterns, and generators
- **React Stack** - Next.js 15, TypeScript, and modern tooling
- **Product Management** - MVP Creator workflow and documentation
- **Development Workflows** - 8+ workflows for Rails and React

### Additional Documentation

- [docs/README.md](docs/README.md) - Documentation overview
- [docs/setup/README.md](docs/setup/README.md) - Detailed setup guide documentation

## 🤝 Contributing

This appears to be a tutorial/course repository. If you're working through the course:

1. Create a new branch for your work
2. Make your changes
3. Test thoroughly across all platforms
4. Document any deviations from the original code

## 📄 License

(Add your license information here)

## 👤 Author

**Joe Masilotti** (com.masilotti.hikingjournal)

## 🔗 Resources

### Framework Documentation
- [Ruby on Rails Documentation](https://guides.rubyonrails.org/)
- [Swift Documentation](https://swift.org/documentation/)
- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Android Jetpack Compose](https://developer.android.com/jetpack/compose)

### Development Tools
- [Maquina App](https://maquina.app) - Rails tools and UI components
- [Claude Code Documentation](https://docs.anthropic.com/en/docs/claude-code)
- [Tailwind CSS](https://tailwindcss.com/docs)
- [Next.js Documentation](https://nextjs.org/docs)

## 📞 Support

For questions or issues:
1. Check the [Interactive Setup Guide](docs/setup/index.html)
2. Review the [docs/](docs/) directory for additional documentation
3. Review the specific chapter's code
4. Compare with adjacent chapters to understand changes
5. (Add support contact information if applicable)

---

**Repository**: https://github.com/nashthecoder/codebase.git

Built with ❤️ for learning full-stack mobile development
