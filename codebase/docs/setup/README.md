# Development Environment Setup Guide

This directory contains comprehensive setup documentation for the Hiking Journal development environment.

## 📄 Contents

### [index.html](index.html) - Interactive Setup Guide

A complete, interactive HTML guide covering:

- **VS Code Setup** - Extensions for Rails and React development
- **Claude Code CLI** - AI coding assistant configuration
- **Product Management** - MVP Creator workflow and documentation
- **Rails Stack** - Plugins, workflows, and Maquina setup
- **React Stack** - Next.js, TypeScript, and Tailwind configuration
- **Component Libraries** - Maquina UI components and patterns

## 🚀 Quick Start

### View the Guide

Open the interactive guide in your browser:

```bash
# From the project root
open docs/setup/index.html

# Or from this directory
open index.html
```

### What's Inside

#### 1. Overview Section
- Quick setup scripts for Rails and React boilerplates
- Technology stack overview (Rails 8.0, Ruby 3.4.4, Next.js 15)
- Product management layer with MVP Creator

#### 2. VS Code Extensions
- **React**: ES7+ Snippets, ESLint, Prettier
- **Rails**: Shopify Ruby LSP, Rails Snippets, Endwise
- **Tailwind**: IntelliSense, Documentation

#### 3. Claude Code Plugins

**Rails Plugins** (from [maquina-app/rails-claude-code](https://github.com/maquina-app/rails-claude-code)):
- `rails-simplifier` - 37signals/One Person Framework patterns
- `rails-security-auditor` - Security audit for Rails 8.0-8.2
- `mvp-creator` - MVP documentation generation
- `better-stimulus` - StimulusJS best practices
- `maquina-ui-standards` - UI components with Tailwind

**React Plugins**:
- `codewarden` - Security and code quality for React/Next.js
- `vibe-coding-plugin` - 77 skills and 18 auditor agents for Next.js 15

#### 4. Maquina Complete Setup
Step-by-step guide to set up a production-ready Rails app with:
- Maquina Generators (`rails g maquina:app`)
- Authentication (Registration, Clave, or None)
- Multi-tenancy with Account model
- Solid Queue, Solid Errors
- 20+ UI components (ERB + Tailwind CSS 4)

#### 5. Development Workflows
- **Rails**: 8 workflows from feature creation to security auditing
- **React**: 8 workflows from component creation to full auditing
- Complete workflow diagrams from idea to production

## 🛠️ Technology Stack

### Rails Backend
- Ruby 3.4.4
- Rails 8.0.0
- SQLite3 (development), PostgreSQL (production)
- Tailwind CSS 4
- Stimulus JS
- Authentication with BCrypt

### iOS Application
- Swift
- Xcode
- SwiftUI/UIKit

### Android Application
- Kotlin
- Jetpack Compose
- Gradle (Kotlin DSL)

### React/Next.js Frontend
- Next.js 15
- TypeScript (strict mode)
- Tailwind CSS 4
- React 19

## 📦 Key Resources

### Rails/Maquina
- [Maquina App](https://maquina.app) - Tools and generators
- [Rails Claude Code Plugins](https://github.com/maquina-app/rails-claude-code)
- [Maquina Generators](https://github.com/maquina-app/maquina_generators)
- [Maquina Components](https://github.com/maquina-app/maquina_components)

### React/Next.js
- [Next.js Documentation](https://nextjs.org/docs)
- [React Documentation](https://react.dev)
- [Tailwind CSS](https://tailwindcss.com/docs)
- [CodeWarden Plugin](https://github.com/tylerbryy/codewarden)
- [Vibe Coding Plugin](https://github.com/soilmass/vibe-coding-plugin)

### Claude Code
- [Claude Code Documentation](https://docs.anthropic.com/en/docs/claude-code)
- [GitHub Repository](https://github.com/anthropics/claude-code)

## 🎯 Product Management Workflow

The guide includes a complete MVP Creator workflow:

1. **Define What** - Research Report, competitor analysis
2. **Define Who** - Business Plan, user personas
3. **Map Journeys** - User flows, feature specs
4. **Build** - Technical Guide, Claude Code setup

## 💡 Usage Tips

### For Rails Development
1. Start with `rails new myapp --css tailwind`
2. Add Maquina gems and run `rails g maquina:app --auth registration`
3. Install Claude Code plugins from rails-claude-code
4. Use `> audit-security` and `> Simplify recent changes` commands

### For React Development
1. Start with `npx create-next-app@latest --typescript --tailwind`
2. Install Claude Code plugins (codewarden, vibe-coding-plugin)
3. Use `/security-audit --fix` and `/flow full-audit` commands
4. Run `/harden` for production readiness

## 🔄 Interactive Features

The HTML guide includes:
- **Sidebar Navigation** - Quick access to all sections
- **Responsive Design** - Works on desktop and mobile
- **Dark Theme** - Easy on the eyes for long reading sessions
- **Code Examples** - Copy-paste ready commands
- **External Links** - Direct links to all documentation

## 📝 Updating the Guide

To update the setup guide:

1. Edit `index.html` with new sections or information
2. Test in browser to ensure navigation and styling work
3. Commit and push changes to the repository

## 🤝 Contributing

If you find issues or have improvements for the setup guide:

1. Update the relevant section in `index.html`
2. Test thoroughly in multiple browsers
3. Submit changes with clear descriptions

---

**Note**: This guide is designed to be self-contained and works offline. All styling and JavaScript are embedded in the HTML file for portability.
